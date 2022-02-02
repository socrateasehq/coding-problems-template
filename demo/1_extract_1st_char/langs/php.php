function firstChar($str) {
return substr($str, 0, 1);
}
$line = fgets(STDIN);
echo firstChar($line);