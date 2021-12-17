const about_button = document.querySelector('.Top-button-2');
const popup_about = document.querySelector('.pop_up_about');
const close_about = document.querySelector('.pop_close_about');


const inputForm = document.querySelector('.input-form');
const addItem = document.querySelector('.Top-button-1')
const close_addItem = document.querySelector('.pop_close_newtask');

const addItem_update = document.querySelector('.Top-button-3');
const inputForm_update = document.querySelector('.input-form update');
const close_update = document.querySelector('.pop_close_update');

const addItem_delete = document.querySelector('.Top-button-4');
const inputForm_delete = document.querySelector('.input-form delete');
const close_delete = document.querySelector('.pop_close_delete');

const addItem_findbyid = document.querySelector('.Top-button-5');
const inputForm_findbyid = document.querySelector('.input-form findbyid');
const close_findbyid = document.querySelector('.pop_close_findbyid');

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

close_addItem.addEventListener('click', () => {
    inputForm.style.display = 'none'
})


addItem_update.addEventListener('click', () => {
    inputForm_update.style.display = 'block'
})

close_update.addEventListener('click', () => {
    inputForm_update.style.display = 'none'
})


addItem_delete.addEventListener('click', () => {
    inputForm_delete.style.display = 'block'
})

close_delete.addEventListener('click', () => {
    inputForm_delete.style.display = 'none'
})

addItem_findbyid.addEventListener('click', () => {
    inputForm_findbyid.style.display = 'block'
})
close_findbyid.addEventListener('click', () => {
    inputForm_findbyid.style.display = 'none'
})


