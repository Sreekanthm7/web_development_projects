import logo from "./logo.svg"
import "./App.css"
import Header from "./components/Header"
import MainBody from "./components/MainBody"
import Footer from "./components/Footer"

function App() {
  return (
    <div className="App">
     <Header />
     <MainBody />
     <Footer />
     <div className="chat-with-sales">
      <a className="chat-with-sales-container">
        <span className="chat-icon">

        </span>
        <p>Chat with sales</p>
      </a>
     </div>
    </div>
  )
}

export default App
