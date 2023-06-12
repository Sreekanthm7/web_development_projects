import React from 'react'
import './DataMainCardTwo.css'

function DataMainCardTwo({img , text}) {
  return (
    <>
        <div className="data-main-card-two-img">
        <img src={img} />
      </div>
      <div className="data-main-card-two-content">
        <h2>{text}</h2>
        <span className="view-all-btn-card-two">VIEW ALL</span>
      </div>
    </>
  )
}

export default DataMainCardTwo