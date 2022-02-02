// User Boilerplate
function main(str) {
    // Write the logic here
    // return an integer containing the number of strings which have n unique vowels
    const vowels = ["a", "e", "i", "o", "u"];
    const stringArray = str.split(" ");
    let numOfStrings = 0;
    for (const string of stringArray) {
        let vowelCount = 0;
        let seenVowel = {};
        for (const char of string) {
            if (vowels.includes(char) && !seenVowel[char]) {
                vowelCount++;
                seenVowel[char] = true;
            }
        }
        if (vowelCount === number) {
            numOfStrings++;
        }
    }
    return numOfStrings;
}

// Compiler Boilerplate
importPackage(java.io);
importPackage(java.lang);
const stream = new BufferedReader(new InputStreamReader(System["in"]));
const line = stream.readLine();
const s = String(new java.lang.String(main(line)));
System.out.println(s.split(".")[0]);
