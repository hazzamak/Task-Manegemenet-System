const about_button = document.querySelector('.Top-button-2');
const popup_about = document.querySelector('.pop_up_about');
const close_about = document.querySelector('.pop_close_about');
const close_about = document.querySelector('.pop_close_about');

const inputForm = document.querySelector('.input-form');
const addItem = document.querySelector('.Top-button-1')

const addItem_update = document.querySelector('.Top-button-3');
const inputForm_update = document.querySelector('.input-form update');

const addItem_delete = document.querySelector('.Top-button-4');
const inputForm_delete = document.querySelector('.input-form delete');

about_button.addEventListener('click', () => {
    popup_about.style.display = 'block'
})

close_about.addEventListener('click', () => {
    popup_about.style.display = 'none'
})

addItem.addEventListener('click', () => {
    inputForm.style.display = 'block'
})

addItem_update.addEventListener('click', () => {
    inputForm_update.style.display = 'block'
})

addItem_delete.addEventListener('click', () => {
    inputForm_delete.style.display = 'block'
})

