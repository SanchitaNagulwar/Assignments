
const number = parseInt(prompt('Enter a Number: '));

let sum = 0, i = 1;

while(i <= number) {
    sum += i;
    i++;
}

document.write("The sum of natural numbers: ", sum);