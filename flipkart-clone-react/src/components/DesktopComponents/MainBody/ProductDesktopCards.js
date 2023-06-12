import React from 'react'
import './ProductDesktopCards.css'

function ProductDesktopCards({img, heading, link, text}) {
  return (
    <div className='product-desktop-cards'>
        <img src={img} />
        <span className='product-cards-heading'>{heading}</span>
        <span className='product-cards-link'>{link}</span>
        <span className='product-cards-text'>{text}</span>
    </div>
  )
}

export default ProductDesktopCards