package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("スタックテスト")
public class StackTest {
	public Stack<Object>stack ;
	public String anElement = "要素1";

	@Nested
	@DisplayName("スタックが空の状態")
	public class whenNew{

		@BeforeEach
		public void createNewStack() {
			System.out.println("@BeforeEach スタックが空の状態") ;
			 stack = new Stack<>();
		}

        @Test
        @DisplayName("isEmpty()を実行するとtrueを返す")
        public void isEmpty() {
        	System.out.println("@BeforeEach isEmpty()を実行するとtrueを返す") ;
            assertTrue(stack.isEmpty());
        }

        @Test
        @DisplayName("pop()を実行するとEmptyStackExceptionをスローする")
        public void throwsExceptionWhenPopped() {
        	System.out.println("@BeforeEach pop()を実行するとEmptyStackExceptionをスローす") ;
            assertThrows(EmptyStackException.class, () -> stack.pop());
        }

    	@Nested
    	@DisplayName("スタックに１回pushした状態")
    	public class afterPushing {

    		@BeforeEach
    		public void pushAnElement() {
    			System.out.println("@BeforeEach スタックに１回pushした状態");
    			 stack.push(anElement) ;
    		}

            @Test
            @DisplayName("isEmpty()を実行するとfalseを返す")
            public void isNotEmpty() {
            	System.out.println("@BeforeEach isEmpty()を実行するとfalseを返");
                assertFalse(stack.isEmpty());
            }

            @Test
            @DisplayName("pop()を実行したものがanElementと等しい")
            public void returnElementWhenPopped() {
            	System.out.println("@BeforeEach pop()を実行したものがanElementと等しい");
                assertEquals(anElement, stack.pop());
            }
    	}
	}


}
