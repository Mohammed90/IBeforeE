IBeforeE
========

This program is created to test whether the rule "I before E, except after C" is true. Spoiler: Not really.

Abstract:
You still have to memorize 922 words that don't follow either rules.

Background:
I shared this on Facebook and a friend pointed out that our eyes might be deceiving us as this was counted or the statistic might be exaggerated.

Method:
Taking his comment into consideration, I looked up a list of all the words, parsed them into a Java program, checked for encounters of "IE", "EI", "CIE", and "CEI".
Results:
IE: 6316
EI: 1010
CEI: 88
CIE: 322

My program counts an incident of "CEI" and "EI". Therefore, a simple subtraction would result in incidents of "EI" without the "C", for example.

Discussion:
It turns out, even if we take the "CEI" cases out of the "EI" count, we're still left with 922 words with "EI" without "C". This renders the _"except after C" rule a, well, no-rule. However, the "I before E" is still pretty much prevalent.

Word list (100-some thousand words):
http://www-01.sil.org/linguistics/wordlists/english/wordlist/wordsEn.txt
