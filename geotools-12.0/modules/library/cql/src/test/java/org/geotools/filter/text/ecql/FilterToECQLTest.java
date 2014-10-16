/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 * 
 *    (C) 2006-2008, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */
package org.geotools.filter.text.ecql;

import org.geotools.filter.text.cql2.FilterToCQLTest;
import org.junit.Assert;
import org.junit.Test;
import org.opengis.filter.Filter;

/**
 * 
 * This is the test class for {@link FilterToECQL}. It extends the {@link FilterToCQLTest} 
 * with the series of test cases required by ECQL syntax. Thus all cql/ecql predicates 
 * should be generated by the {@link FilterToECQL}  class.
 * 
 * 
 * @author Mauricio Pazos
 *
 *
 * @source $URL$
 */
public class FilterToECQLTest extends FilterToCQLTest {

	@Test
	public void id()throws Exception{
		cqlTest("IN (1,2,3,4)");
	}

    @Test
    public void idString()throws Exception{
        cqlTest("IN ('foo','bar')");
    }

    @Test
    public void idUUID()throws Exception{
        cqlTest("IN ('cb606c93-8642-4cff-84e8-1817e8307097')");
    }

	public void intersectWhithGeomExpressions() throws Exception {
    	cqlTest("INTERSECTS(POLYGON((1 2, 2 2, 2 3, 1 2)), POINT(1 2))");
		
	}
	
	@Test
	public void likeWithFunction() throws Exception {
		cqlTest("strConcat('aa','bbcc') LIKE '%bb%'");
	}

	@Override
    protected void cqlTest( String cql ) throws Exception {
        Filter filter = ECQL.toFilter(cql);
        Assert.assertNotNull( filter );
        FilterToECQL toECQL = new FilterToECQL();

        String output = filter.accept( toECQL, null ).toString();
        Assert.assertNotNull( output );
        Assert.assertEquals( cql, cql, output );
    }
	
	
}