const about_button = document.querySelector('.Top-button-2');
const popup_about = document.querySelector('.pop_up_about');
const close_about = document.querySelector('.pop_close_about');

const inputForm = document.querySelector('.input-form');
const addItem = document.querySelector('.Top-button-1')

about_button.addEventListener('click', () => {
    popup_about.style.display = 'block';
})

addItem.addEventListener('click', () => {
    inputForm.style.display = 'block'
})
