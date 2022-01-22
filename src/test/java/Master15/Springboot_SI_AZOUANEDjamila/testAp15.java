package Master15.Springboot_SI_AZOUANEDjamila;

import static org.junit.Assert.assertEquals;

//import static org.hamcrest.CoreMatchers.containsString;
//import static org.junit.Assert.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Master15.Springboot_SI_AZOUANEDjamila.model.Carre;
import Master15.Springboot_SI_AZOUANEDjamila.model.Cercle;
import Master15.Springboot_SI_AZOUANEDjamila.model.Cube;
import Master15.Springboot_SI_AZOUANEDjamila.model.FormeGeometrique;
import Master15.Springboot_SI_AZOUANEDjamila.model.Point;
import Master15.Springboot_SI_AZOUANEDjamila.model.Rectangle;
import Master15.Springboot_SI_AZOUANEDjamila.model.Triangle;
import Master15.Springboot_SI_AZOUANEDjamila.model.TriangleEquilateral;
import Master15.Springboot_SI_AZOUANEDjamila.model.TriangleIsocele;
import Master15.Springboot_SI_AZOUANEDjamila.model.Sphere;

public class testAp15 {

	Point p;
	Carre c;Rectangle r;Cube cb;Cercle cr;TriangleEquilateral te;
	TriangleIsocele ts;Sphere sph;
	
	@Before
	public void before() {
	p = new Point(1,2);
	c = new Carre(p,5);
	r = new Rectangle(p,5,8);
	te = new TriangleEquilateral(p,8);
	ts = new TriangleIsocele(p,8,10);
	cr = new Cercle(p,5);
	cb = new Cube(p,3);
	sph = new Sphere(p,7);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test() {
		p = new Point(-1,-2);
       }
	
	
	void testSuperficie()  {
		
		//5*5=25
		assertEquals(25,0, c.superficie());
		
		//3*3*6=54
		assertEquals(54,0, cb.superficie());
		
		//5*8=40
		assertEquals(40,0, r.superficie());
		
		//(5/2)² * 3.14	= 19,625
		assertEquals(19,625, cr.superficie());
		
		//(c × h) ÷ 2 = (5*8)÷ 2=40
		assertEquals(40,0,ts.superficie());
		
		//4π(d/2)² = 153,86
		assertEquals(153,86,sph.superficie());
    }
	
}
