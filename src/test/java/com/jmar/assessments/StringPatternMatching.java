package com.jmar.assessments;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class StringPatternMatching {




    @Test
    public void test_StringPatternMatching() {

        // Test 1
        String pattern = "101";
        String source = "helloworld";
        int matchCount = stringPatternMatching(pattern, source);
        System.out.println("pattern = " + pattern);
        System.out.println("source  = " + source);
        System.out.println("matchCount = " + matchCount);

        // Test 2 (from CodeSignal example. See Notepad version)
        pattern = "010";
        source = "amazing";
        matchCount = stringPatternMatching(pattern, source);
        System.out.println("pattern = " + pattern);
        System.out.println("source  = " + source);
        System.out.println("matchCount = " + matchCount);


    }


    private int stringPatternMatching(String pattern, String source) {

        // Round 1: Working now but had a lot of issues that needed to be corrected.

        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "y");

        if(source.length() < pattern.length()) {
            return 0;
        }
        String [] patternArray = pattern.split("");
        String [] sourceArray = source.split("");

        int matchCount = 0;
        String VOWEL = "0";

        for(int i = 0; i <= (sourceArray.length - patternArray.length); i++) {

            boolean patternMatches = true;

            for(int n = 0; n < patternArray.length; n++) {

                boolean isVowel = vowels.contains(sourceArray[i + n]);
                if((isVowel && patternArray[n].equals(VOWEL))			// vowel
                        || (!isVowel && !patternArray[n].equals(VOWEL))){  //consonant
                    // match
                } else {
                    patternMatches = false;
                    break;
                }
            }
            if(patternMatches) {
                matchCount++;
            }

        }
        return matchCount;
    }
}
