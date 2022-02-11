//User Boilerplate
function firstChar($str) {
    return substr($str, 0, 1);
}

// Compiler Boilerplate
$line = fgets(STDIN);
echo firstChar($line);