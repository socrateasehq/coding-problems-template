// User Boilerplate
function main(str) {
    // Write the logic here
    // return 0 or 1
    const [str1, str2] = str.split(" ");
    const str2Dict = {};
    for (const ch of str2) {
        str2Dict[ch] = (Number(str2Dict[ch]) || 0) + 1;
    }

    for (const ch of str1) {
        if (str2Dict[ch]) {
            if (str2Dict[ch] > 0) {
                str2Dict[ch] -= 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
    return 1;
}

// Compiler Boilerplate
importPackage(java.io);
importPackage(java.lang);
const stream = new BufferedReader(new InputStreamReader(System["in"]));
const line = stream.readLine();
const s = String(new java.lang.String(main(line)));
System.out.println(s.split(".")[0]);
