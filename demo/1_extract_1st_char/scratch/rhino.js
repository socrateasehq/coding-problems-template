// User Boilerplate
function main(str) {
    const char = str.charAt(0);
    const array1 = ["a", "b", "c"];

    for (const element of array1) {
        console.log(element);
    }
    return char;
}

// Compiler Boilerplate
// importPackage(java.io);
// importPackage(java.lang);
// const stream = new BufferedReader(new InputStreamReader(System["in"]));
// const line = stream.readLine();
const line = readline();
const s = main(line);
print(s);
