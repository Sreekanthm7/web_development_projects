import React, { useState, useEffect, useRef } from "react"
import "./BeautyAndMore.css"
import DataMainCardTwo from "./DataMainCardTwo"
import ProductDesktopCards from "./ProductDesktopCards"
import arrow from "../../../assets/img/btnarrowdesktop.svg"

function BeautyAndMore() {
  const [mainCardData, setMainCardData] = useState({})
  const [productCard, setProductCard] = useState([])
  const imageCard = useRef()
  const arrowRight = useRef()
  const arrowLeft = useRef()

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setMainCardData(data.BeautyFoodToysAndMore)
        setProductCard(data.BeautyFoodToysAndMoreDesktopCards)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  const handleClickRight = () => {
    imageCard.current.style.transform = `translateX(${-25}%)`
    arrowRight.current.style.display = "none"
    arrowLeft.current.style.display = "flex"
    imageCard.current.style.transition = "transform ease-in-out 0.45s"
  }

  const handleClickLeft = () => {
    imageCard.current.style.transform = `translateX(${2}%)`
    arrowLeft.current.style.display = "none"
    arrowRight.current.style.display = "flex"
    imageCard.current.style.transition = "transform ease-in-out 0.45s"
  }

  return (
    <>
      <div className="beauty-and-more">
        <div className="beauty-and-more-main-card">
          <DataMainCardTwo
            img={mainCardData.backgroundImg}
            text={mainCardData.text}
          />
        </div>
        <div
          className="left-btn-beauty"
          ref={arrowLeft}
          onClick={handleClickLeft}
        >
          <img src={arrow} />
        </div>
        <div className="beauty-and-more-products" ref={imageCard}>
          {productCard.map((item) => {
            return (
              <ProductDesktopCards
                img={item.img}
                heading={item.heading}
                link={item.link}
                text={item.text}
                key={item.img}
              />
            )
          })}
        </div>
        <div
          className="right-btn-beauty"
          onClick={handleClickRight}
          ref={arrowRight}
        >
          <img src={arrow} />
        </div>
      </div>
    </>
  )
}

export default BeautyAndMore
