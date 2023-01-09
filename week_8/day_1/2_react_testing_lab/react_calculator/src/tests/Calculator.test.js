import React from 'react';
import Calculator from '../containers/Calculator';
import {render, fireEvent} from '@testing-library/react';

describe('Calculator', () => {
  let container;
  beforeEach(() => {
    container = render(<Calculator/>)
  })

  it('should change running total on number enter', () => {
    const button4 = container.getByTestId('number4');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button4);
    expect(runningTotal.textContent).toEqual('4');
  })


it('should add together accurately', () => {
   const button1 = container.getByTestId('number1');
    const addButton = container.getByTestId('operator-add');
    const button4 = container.getByTestId('number4');
    const equalsButton = container.getByTestId('operator-equals');
    const runningTotal = container.getByTestId('running-total');
    fireEvent.click(button1);
    fireEvent.click(addButton);
    fireEvent.click(button4);
    fireEvent.click(equalsButton);
    expect(runningTotal.textContent).toEqual('5');

})

it('should subtract accurately', () => {
  const button7 = container.getByTestId('number7');
   const subtractButton = container.getByTestId('operator-subtract');
   const button4 = container.getByTestId('number4');
   const equalsButton = container.getByTestId('operator-equals');
   const runningTotal = container.getByTestId('running-total');
   fireEvent.click(button7);
   fireEvent.click(subtractButton);
   fireEvent.click(button4);
   fireEvent.click(equalsButton);
   expect(runningTotal.textContent).toEqual('3');

})

it('should multiply accurately', () => {
  const button3 = container.getByTestId('number3');
   const multiplyButton = container.getByTestId('operator-multiply');
   const button5 = container.getByTestId('number5');
   const equalsButton = container.getByTestId('operator-equals');
   const runningTotal = container.getByTestId('running-total');
   fireEvent.click(button3);
   fireEvent.click(multiplyButton);
   fireEvent.click(button5);
   fireEvent.click(equalsButton);
   expect(runningTotal.textContent).toEqual('15');

})

it('should divide accurately', () => {
  const button2 = container.getByTestId('number2');
  const button1 = container.getByTestId('number1');
   const divideButton = container.getByTestId('operator-divide');
   const button7 = container.getByTestId('number7');
   const equalsButton = container.getByTestId('operator-equals');
   const runningTotal = container.getByTestId('running-total');
   fireEvent.click(button2);
   fireEvent.click(button1);
   fireEvent.click(divideButton);
   fireEvent.click(button7);
   fireEvent.click(equalsButton);
   expect(runningTotal.textContent).toEqual('3');

})

it('should concatenate', () => {
  const button2 = container.getByTestId('number2');
  const button1 = container.getByTestId('number1');
   const button7 = container.getByTestId('number7');
   const equalsButton = container.getByTestId('operator-equals');
   const runningTotal = container.getByTestId('running-total');
   fireEvent.click(button2);
   fireEvent.click(button1);
   fireEvent.click(button7);
   fireEvent.click(equalsButton);
   expect(runningTotal.textContent).toEqual('217');

})

it('should chain multiply operations together', () => {
  const button2 = container.getByTestId('number2');
  const addButton = container.getByTestId('operator-add');
  const button3 = container.getByTestId('number3');
  const subtractButton = container.getByTestId('operator-subtract');
   const button1 = container.getByTestId('number1');
   const equalsButton = container.getByTestId('operator-equals');
   const runningTotal = container.getByTestId('running-total');
   fireEvent.click(button2);
   fireEvent.click(addButton);
   fireEvent.click(button3);
   fireEvent.click(subtractButton);
   fireEvent.click(button1);
   fireEvent.click(equalsButton);
   expect(runningTotal.textContent).toEqual('4');

})

it('should clear the running total and not the calculation', () => {
  const button3 = container.getByTestId('number3');
  const addButton = container.getByTestId('operator-add');
  const button2 = container.getByTestId('number2');
  const equalsButton = container.getByTestId('operator-equals');
  const button1 = container.getByTestId('number1');
  const clearButton = container.getByTestId('clear');
  const runningTotal = container.getByTestId('running-total');
  fireEvent.click(button3);
  fireEvent.click(addButton);
  fireEvent.click(button2);
  fireEvent.click(equalsButton);
  fireEvent.click(addButton);
  fireEvent.click(button1);
  fireEvent.click(clearButton);
  fireEvent.click(addButton);
  fireEvent.click(button2);
  fireEvent.click(equalsButton);
  expect(runningTotal.textContent).toEqual('7')




})

})
