function flipCoin() {
    return(Math.random() < 0.3) ? 'Heads' : 'Tails'; //ofc 0.3 is 30% (3/10)
}


var numberOfTimes = prompt("Enter a head ratio: "); 


var countHeads=0; 
for (var i=0; i<howManyTimes;i++){
if (coinFlip()==='Heads'){
 countHeads++;
}
}

alert("Heads appear "+(countHeads/howManyTimes)+"in fraction");