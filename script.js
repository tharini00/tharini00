let wins = 0;
let losses = 0;
let ties = 0;
let movesLeft = 10;

function playGame(userChoice){
   if (movesLeft > 0){
   const choices=['stone', 'paper', 'scissors'];
   const randomIndex = Math.floor(Math.random() * 3);
   const computerChoice = choices[randomIndex];
   

   let result;



   if(userChoice === computerChoice){
       result="it's a tie!";
       ties++;
   }else if (
       (userChoice === 'stone' && computerChoice === 'scissors') ||
       (userChoice === 'paper' && computerChoice === 'stone') ||
       (userChoice === 'scissors' && computerChoice === 'paper')
   )
   
   {
       result = "YOU WIN!";
       wins++;
   }else{
       result = "Computer Wins!";
       losses++;
   }
  
   displayResult(userChoice,computerChoice,result);
   updateScore();
   movesLeft--;
   if (movesLeft === 0){
       announceEndofGame();
   }
}
    
}

function displayResult(userChoice,computerChoice,result){
    const resultDiv = document.createElement('div');
   
   
    document.getElementById('result').appendChild(resultDiv);
}
function updateScore(){
    document.getElementById('wins').innerText = wins;
    document.getElementById('losses').innerText = losses;
    document.getElementById('ties').innerText = ties;
    document.getElementById('movesLeft').innerText = movesLeft;
}
function announceEndofGame(){
    const endMessage = document.createElement('p');
    endMessage.textContent = 'Game Over! Moves exhausted.';

    document.getElementById('result').appendChild(endMessage);
}