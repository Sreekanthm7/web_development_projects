import React from 'react'
import './GrabOrGoneCards.css'

function GrabOrGoneCards({img, text, link}) {
  return (
    <>
        <div className='grab-or-gone-cards'>
            <div className='grab-or-gone-cards-img'>
                <img src={img} />
            </div>
            <div className='grab-or-gone-cards-content'>
                <p>{text}</p>
                <a>{link}</a>
            </div>
        </div>
    </>
  )
}

export default GrabOrGoneCards