package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		//オブジェクトの生成
		Calculator cal = new Calculator() ;
		//期待値
		int expected = 5 ;
		//実測値
		int actual = cal.add(3,2) ;
		//期待値と実測値の比較
		assertEquals(actual,expected) ;

	}

	@Test
	void testSub() {
		Calculator cal = new Calculator() ;
		int expected = 1 ;
		int actual = cal.sub(3,2) ;
		assertEquals(actual,expected) ;

	}

	@Test
	void testMul() {
		Calculator cal = new Calculator() ;
		int expected = 6 ;
		int actual = cal.mul(3,2) ;
		assertEquals(actual,expected) ;

	}

	@Test
	void testDiv() {
		Calculator cal = new Calculator() ;
		float expected = 1.5f ;
		float actual = cal.div(3,2) ;
		assertEquals(actual,expected) ;

	}
	@Test
	void testDivException() {
		Calculator cal = new Calculator() ;
		try {
			cal.div(3, 0) ;
			fail() ;
		}catch(IllegalArgumentException e) {

		}
	}

}
