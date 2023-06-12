import React, { useState, useEffect } from "react"
import "./Carousel.css"

function Carousel() {
  const [carousel, setCarousel] = useState([])
  let [index, setIndex] = useState(0)

  const fetchData = () => {
    fetch(
      "https://raw.githubusercontent.com/Sreekanthm7/jsondata/main/flipkart-json-data/flipkart.json"
    )
      .then((response) => {
        return response.json()
      })
      .then((data) => {
        setCarousel(data.flipkartCarouselMobile)
      })
  }

  useEffect(() => {
    fetchData()
  }, [])

  const CallIndex = () => {
    setIndex(
      index === carousel.length - 1 ? 0 : index + 1
    )
  }

  useEffect(() => {
    setTimeout(CallIndex, 2000)
  })

  return (
    <>
      <div className="carousel-mobile">
        {carousel.map((item) => {
          return (
            <div
              className="carousel-img"
              style={{
                transform: `translateX(${-100 * index}%)`,
                transition: "transform ease-out 0.45s",
              }}
              key={item}
            >
              <img src={item} />
            </div>
          )
        })}
      </div>
    </>
  )
}

export default Carousel
