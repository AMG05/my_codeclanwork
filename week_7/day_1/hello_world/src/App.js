import './App.css';
import {useState} from 'react'

function App() {

  const [greeting, setGreeting] = useState("Hello World");
  const [total, setTotal] = useState(0);

  const handleClick = (name) => {
    setGreeting("Hello " + name)
  }

  const deposit = () => {
    setTotal(total + 10);
  }

  const withdrawal = () => {
    setTotal(total - 10);
  }

  return (
    <>
    <h1>{greeting}</h1>
    <button onClick ={() => handleClick("Anne")}>Change Greeting</button>
    <p>Total: £{total}</p>
    <button onClick={deposit}>Deposit</button>
    <button onClick={withdrawal}>Withdrawal</button>
    </>
  );
}

export default App;
