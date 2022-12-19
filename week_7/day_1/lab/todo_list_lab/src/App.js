import './App.css';
import React, {useState} from 'react';

function App() {

  const[items, setItems] = useState([
    {name: "Buy shopping", isPriority:false},
    {name: "Clean bathroom", isPriority:false},
    {name: "Car's MOT", isPriority:false},
    
  ])

  const [newItem, setNewItem] = useState("")

  const itemNodes = items.map((item, index) => {
    return<li key={index} className={item.isPriority ? "priority" : "not-priority"}>
      <span>{item.name}</span>
      {item.isPriority ?
      <span className = "priority">High priority</span> : <button onClick={() => priorityItem(index)}>High Priority</button>}
      </li>
  })

  const handleItemInput = (event) => {
    setNewItem(event.target.value)
  }

  const priorityItem = (index) => {
    const copyItems = [...items]
    const updatedItem = {...copyItems[index]}
    updatedItem.isPriority = true
    copyItems[index] = updatedItem
    setItems(copyItems)
  }

  const saveNewItem = (event) => {
    event.preventDefault();
    const copyItems = [...items]
    copyItems.push({name: newItem, isPriority: false})
    setItems(copyItems)
    setNewItem("")
  }

  return (
    <div className="App">

      <h1>To-do List</h1>
      <hr></hr>

    
      <form onSubmit = {saveNewItem}>
        <label htmlFor="new-item"></label>
        <input id="new-item" type="text" value={newItem} onChange={handleItemInput}/>
        <input type="submit" value="Save New Item"/>
        <label htmlFor="radio">High</label>
        <input id="high-priority" type="radio" value="High"/>
        <label htmlFor="radio">Low</label>
        <input id="low-priority" type="radio" value="Low"/>
        
      </form>

      <ul>
        {itemNodes}
      </ul>

    </div>
  );
  
}

export default App;
