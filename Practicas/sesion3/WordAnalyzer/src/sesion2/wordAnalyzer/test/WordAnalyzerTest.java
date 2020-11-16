package sesion2.wordAnalyzer.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sesion2.wordaAnalyzer.WordAnalyzer;

public class WordAnalyzerTest {
	private WordAnalyzer empty;
	
	@Before
	public void setUp() {
		empty = new WordAnalyzer("");
	}
	@Test
	public void testFirstRepeatedCharacter() {
		//caso1: el caracter repetido este al principio
		WordAnalyzer analyzer = new WordAnalyzer("aaabcde");
		assertEquals('a',analyzer.firstRepeatedCharacter());
	
		//caso2: el caracter repetido este al final
		analyzer = new WordAnalyzer("abcdeee");
		assertEquals('e',analyzer.firstRepeatedCharacter());
		
		//caso3: el caracter repetido este en medio
		analyzer = new WordAnalyzer("abcccde");
		assertEquals('c',analyzer.firstRepeatedCharacter());
		
		
		//caso4: hay mas de un grupo de caracteres repetidos
		analyzer = new WordAnalyzer("aaabcccde");
		assertEquals('a',analyzer.firstRepeatedCharacter());
		
		//caso5: no hay grupos de caracteres repetidos
		analyzer = new WordAnalyzer("abcde");
		assertEquals(0,analyzer.firstRepeatedCharacter());
		
		//caso6: la cadena es una cadena vacia
		assertEquals(0,empty.firstRepeatedCharacter());
	}

	@Test
	public void testFirstMultipleCharacter() {
		//caso1: hay solo una palabra multilple
		WordAnalyzer analyzer = new WordAnalyzer("hollow");
		assertEquals('o',analyzer.firstMultipleCharacter());
		
		//caso2: no hay palabras repetidas
		analyzer = new WordAnalyzer("empty");
		assertEquals(0,analyzer.firstMultipleCharacter());
		
		//caso3: hay mas de dos letras repetidas
		analyzer = new WordAnalyzer("aabbcc");
		assertEquals('a',analyzer.firstMultipleCharacter());
	}

	@Test
	public void testCountGroupsOfRepeatedCharacters() {
		//caso1: solo hay 1 grupo de caracteres repetidos
		WordAnalyzer analyzer = new WordAnalyzer("hollow");
		assertEquals(1,analyzer.countGroupsOfRepeatedCharacters());
		
		//caso2: no hay caracteres repetidos
		analyzer = new WordAnalyzer("empty");
		assertEquals(0,analyzer.countGroupsOfRepeatedCharacters());
		
		//caso3: hay mas de dos grupos de caracteres repetidos
		analyzer = new WordAnalyzer("aabbcc");
		assertEquals(3,analyzer.countGroupsOfRepeatedCharacters());
	}

}
