// 1. which element will be dispathing the event?
// (e.g document)
// 2. ehich even should we listen for?
// (e.g DOMContentLoaded)
// 3.Which pieve of code should run when the even is dispathed
// (e.g call-back(console.log...))




document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript has loaded');

// ###################################################
// ##handle button

  const handleButtonClick = function(){
    const resultParagraph = document.querySelector('#button-result');
    resultParagraph.textContent = 'That button has definitely been clicked';
  }
  
  
  const button = document.querySelector('#button');
  button.addEventListener('click', handleButtonClick);
// #############################################
// Handle input

  const handleInput = function(event){
    // 1. Get the value from the input.
    // 2. Update the paragraph text.
    const resultParagraph = document.querySelector('#input-result')
    resultParagraph.textContent = `You typed: ${event.target.value}`;

  }
  const textInput = document.querySelector('#input')
  textInput.addEventListener('input', handleInput);

  // ############################
  // Handle select
  const handleSelectChange = function(event){
    const resultParagraph = document.querySelector('#select-result');
    resultParagraph.textContent = `You selected ${event.target.value}`;
  }


  const select = document.querySelector('#select');
  select.addEventListener('change', handleSelectChange);

  // ##########################
  // Handle form submit

  const handleFormSubmit = function(event){
    event.preventDefault();
    const resultParagraph = document.querySelector('#form-result');
    resultParagraph.textContent = `
    Your name: 
    ${event.target.first_name.value}
    ${event.target.last_name.value}
    `
  }
  
  const form = document.querySelector('#form')
  form.addEventListener('submit', handleFormSubmit);

  






});
