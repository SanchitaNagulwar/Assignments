function sum(arr) { 
    let sum = 0; 

    for (let i = 0; i < arr.length; i++) 
        sum += arr[i]; 
    return sum; 
} 


function sum1(arr){
    let sum=0, i=0;
    while(i<arr.length){
        sum+=arr[i];
        i++;
    }
    return sum;
}
 
function sum2(arr){
    let sum=0, i=0;
    do{
        sum+=arr[i];
        i++;
    }while(i<arr.length);
    return sum;
}


let arr = [2,4,6,7];
document.write("Sum of an array using for loop is " + sum(arr)+"<br>");
document.write("Sum of an array using while loop is " + sum1(arr)+"<br>");
document.write("Sum of an array using do while loop is " + sum2(arr)+"<br>");

