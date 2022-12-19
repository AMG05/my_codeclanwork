document.addEventListener('DOMContentLoaded', () => {
  console.log('JavaScript loaded');
}

const handleFromSubmit = function(book){
  book.preventDefault();
  const resultParagraph = document.querySelector('#reading-list');
  resultParagraph.textContent = `
  Title: ${book.target.title.value}
  Author: ${book.target.author.value}
  Category: ${book.target.category.value}`
}



// const newListItem = document.createElement('li')
// newListItem.textContent = 'Purple';
// newListItem.classList.add('purple');
// const list = document.querySelector('ul');
// list.appendChild(newListItem);


const form = document.querySelector('#new-item-form')
form.addEventListener('submit', handleFromSubmit);




const handleSelectChange = function(book){
  const resultParagraph = document.querySelector('#select-result');
  resultParagraph.textContent = `${book.target.value}`;
}


const select = document.querySelector('#select');
select.addEventListener('change', handleSelectChange);
)
