import {useState, useEffect} from 'react'
import './App.css';

function App() {


  const [number, setNumber] = useState(0)
  const [divideNum, setDivideNum] = useState(0)

  useEffect(() => {
    setDivideNum if(number %3 ===0 && number %5 ===0) {
      setAnswer('fizzbuzz')
    } else if (number % 3 ===0) {
      setAnswer('fizz')
    }

  }, [number])

  



  const handleInc = () => {
    setNumber(number +1)
    
  }
  
  
  
  
  
  return (
    <div>
      <button value = {number} onClick={handleInc}>+</button>
      <h2>Number is {number}</h2>
      <h2>Fizz{divideNum}</h2>
    </div>

    
  );
}

export default App;
