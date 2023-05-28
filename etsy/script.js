let state ;
const navbar = document.querySelector(".etsy-nav")

const cardsContainer = document.querySelector(".cards-container")

const giftImg =
  '<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 5 22 12" width="16" height="12" aria-hidden="true" focusable="false"><path d="M5,6A1,1,0,0,0,4,7v3H5v9a1,1,0,0,0,1,1h5V6H5Z"></path><path d="M19,6H13.007A4.245,4.245,0,0,0,14.97,3.744a1.614,1.614,0,0,0-2.65-1.375,1.757,1.757,0,0,0-.315.324,1.753,1.753,0,0,0-.315-0.324A1.615,1.615,0,0,0,9.042,3.746,4.257,4.257,0,0,0,11.006,6H13V20h5a1,1,0,0,0,1-1V10h1V7A1,1,0,0,0,19,6Z"></path></svg>'

const categoryListData = [
  {
    label: "Sellers' Sales Hub",
    imageURL: "",
  },
  {
    label: "Jewellery & Accessories",
    imageURL: "",
  },
  {
    label: "Clothing & Shoes",
    imageURL: "",
  },
  {
    label: "Home & Living",
    imageURL: "",
  },
  {
    label: "Wedding & Party",
    imageURL: "",
  },
  {
    label: "Toys & Entertainment",
    imageURL: "",
  },
  {
    label: "Art & Collectibles",
    imageURL: "",
  },
  {
    label: "Craft Supplies",
    imageURL: "",
  },
  {
    imageURL: giftImg,
    label: "Gifts",
  },
]
function createNavBar() {
  const totalList = document.createElement("ul")
  navbar.appendChild(totalList)
  totalList.classList.add("total-list-nav")

  for (let key in categoryListData) {
    //   console.log(categoryListData[key])
    const singleList = document.createElement("li")
    //   console.log(categoryListData[key].label)
    singleList.innerHTML = categoryListData[key].label
    if (categoryListData[key].label === "Gifts") {
      singleList.innerHTML =
        categoryListData[key].imageURL + categoryListData[key].label
    }

    totalList.appendChild(singleList)
  }
}
createNavBar()
const discoverContainer = document.querySelector(".discover-content")

const discoverListData = [
  {
    imageURL: `https://i.etsystatic.com/17600118/c/1000/1000/0/119/il/d077de/2325460652/il_300x300.2325460652_lhfz.jpg`,
    label: "Wedding",
  },
  {
    imageURL: `https://i.etsystatic.com/18077312/r/il/b10e09/2350226444/il_300x300.2350226444_odar.jpg`,
    label: "Jewellery",
  },
  {
    imageURL: `https://i.etsystatic.com/32501528/c/1518/1518/253/562/il/4bdfa0/3702738409/il_300x300.3702738409_qfmi.jpg`,
    label: "Clothing",
  },
  {
    imageURL: `https://i.etsystatic.com/16676438/c/2002/2002/449/0/il/89ea5d/1467855817/il_300x300.1467855817_ksv4.jpg`,
    label: "Home & Living",
  },
  {
    imageURL: `https://i.etsystatic.com/30725321/r/il/a22d35/4016941798/il_300x300.4016941798_bruv.jpg`,
    label: "Wall Art",
  },
  {
    imageURL: `https://i.etsystatic.com/19220794/r/il/28ced3/2951466885/il_300x300.2951466885_1ly4.jpg`,
    label: "Kitchen & Dining",
  },
]
// function createDiscoverContent(imageURL, labels) {
//   const discoverCardContent = document.createElement("div")
//   discoverContainer.appendChild(discoverCardContent)
//   discoverCardContent.classList.add("content-background")

//   const discoverImagesEtsy = document.createElement("div")
//   discoverCardContent.appendChild(discoverImagesEtsy)
//   discoverImagesEtsy.classList.add("discover-images-etsy")

//   const totalList = document.createElement("ul")
//   discoverImagesEtsy.appendChild(totalList)

//   const singleList = document.createElement("li")
//   totalList.appendChild(singleList)

//   const imgContainerEtsy = document.createElement("div")
//   singleList.appendChild(imgContainerEtsy)
//   imgContainerEtsy.classList.add("img-container-etsy")

//   const cardImg = document.createElement("img")
//   cardImg.src = imageURL
//   imgContainerEtsy.appendChild(cardImg)

//   const discoverCardText = document.createElement("a")
//   singleList.appendChild(discoverCardText)

//   const cardText = document.createElement("p")
//   discoverCardText.appendChild(cardText)
//   cardText.innerHTML = labels
// }

// for (let key in discoverListData) {
//   createDiscoverContent(
//     discoverListData[key].imageURL,
//     discoverListData[key].label
//   )
// }

let discover = discoverListData.map(function(item) {
    const  html = `
      <div class = "content-background">
      <div class = "discover-images-etsy">
      <ul>
        <li>
        <div class = "img-container-etsy">
        <img src = '${item.imageURL}'>
        </div>
        <a>
          <p>${item.label}</p>
        </a>
        </li>
      </ul>
      </div>
      </div>
    
    `

    return html;
});

console.log( discover.join(''));
discoverContainer.innerHTML =  discover.join('')

const dealsOfTheDay = document.querySelector(".deals-of-the-day")

const dealsOfTheDayList = [
  {
    imageURL: `https://i.etsystatic.com/22368382/r/il/006d21/4245808662/il_300x300.4245808662_a3x4.jpg`,
    offer: `Up to 40% off on`,
    label: `Women's Ethnic Clothing`,
  },
  {
    imageURL: `https://i.etsystatic.com/32501528/c/1488/1488/0/0/il/23a5b4/3700725057/il_300x300.3700725057_szgj.jpg`,
    offer: `Up to 40% off on`,
    label: `Women's Western Clothing`,
  },
  {
    imageURL: `https://i.etsystatic.com/25566015/c/2003/2003/0/274/il/5b71e2/3196479462/il_300x300.3196479462_20xh.jpg`,
    offer: `Up to 40% off on`,
    label: `Men's Clothing`,
  },
  {
    imageURL: `https://i.etsystatic.com/38026977/r/il/f2c1ad/4277525816/il_300x300.4277525816_f4wp.jpg`,
    offer: `Up to 40% off on`,
    label: `Fashion Jewellery`,
  },
  {
    imageURL: `https://i.etsystatic.com/32501528/c/1757/1757/247/180/il/67dc01/4248212322/il_300x300.4248212322_psvv.jpg`,
    offer: `Up to 40% off on`,
    label: `Winter Clothing`,
  },
  {
    imageURL: `https://i.etsystatic.com/23528878/r/il/625e23/2589827894/il_300x300.2589827894_bi5a.jpg`,
    offer: `Up to 40% off on`,
    label: `Wedding Clothing`,
  },
]

// function createDealsOfTheDayContent(imageURL, offer, label) {
//   // const dealsOfTheDayCardContainer = document.createElement('div')
//   // dealsOfTheDayContainer.appendChild(dealsOfTheDayCardContainer)
//   // dealsOfTheDayCardContainer.classList.add('cards-container')

//   const dealsOfTheDayCards = document.createElement("div")
//   cardsContainer.appendChild(dealsOfTheDayCards)
//   dealsOfTheDayCards.classList.add("deals-of-the-day-cards")

//   const dealsOfTheDayCardBox = document.createElement("div")
//   dealsOfTheDayCards.appendChild(dealsOfTheDayCardBox)
//   dealsOfTheDayCardBox.classList.add("deals-of-the-day-card-box")

//   const dealsOfTheDayImg = document.createElement("img")
//   dealsOfTheDayImg.src = imageURL
//   dealsOfTheDayCardBox.appendChild(dealsOfTheDayImg)
//   dealsOfTheDayImg.classList.add("deals-of-the-day-img")

//   const dealsOfTheDayTextContent = document.createElement("div")
//   dealsOfTheDayCards.appendChild(dealsOfTheDayTextContent)
//   dealsOfTheDayTextContent.classList.add("deals-of-the-day-text-content")

//   const dealsOfTheDayOffer = document.createElement("div")
//   dealsOfTheDayTextContent.appendChild(dealsOfTheDayOffer)
//   dealsOfTheDayOffer.classList.add("deals-of-the-day-offer")
//   dealsOfTheDayOffer.innerHTML = offer

//   const dealsOfTheDayText = document.createElement("div")
//   dealsOfTheDayTextContent.appendChild(dealsOfTheDayText)
//   dealsOfTheDayText.classList.add("deals-of-the-day-text")
//   dealsOfTheDayText.innerHTML = label
// }
// for (let key in dealsOfTheDayList) {
//   createDealsOfTheDayContent(
//     dealsOfTheDayList[key].imageURL,
//     dealsOfTheDayList[key].offer,
//     dealsOfTheDayList[key].label
//   )
// }



let dealsOfTheDayCardContainer=dealsOfTheDayList.map(function(item) {
  const html = `
    
    <div class="deals-of-the-day-cards">
    <div class="deals-of-the-day-card-box">
    <img src= "${item.imageURL}" class= "deals-of-the-day-img">
    <div class= "deals-of-the-day-text-content">
    <div class="deals-of-the-day-offer">${item.offer}</div>
    <div class="deals-of-the-day-text">${item.label}</div>
    </div>
    </div>
    </div>
   
  `;
  return html;
});

console.log( dealsOfTheDayCardContainer.join(''));
cardsContainer.innerHTML =  dealsOfTheDayCardContainer.join('')

const popularGifts = document.querySelector(".popular-gifts")
const ratingFullImg = `<svg xmlns="http://www.w3.org/2000/svg" viewBox="3 3 18 18" aria-hidden="true" focusable="false"><path d="M19.985,10.36a0.5,0.5,0,0,0-.477-0.352H14.157L12.488,4.366a0.5,0.5,0,0,0-.962,0l-1.67,5.642H4.5a0.5,0.5,0,0,0-.279.911L8.53,13.991l-1.5,5.328a0.5,0.5,0,0,0,.741.6l4.231-2.935,4.215,2.935a0.5,0.5,0,0,0,.743-0.6l-1.484-5.328,4.306-3.074A0.5,0.5,0,0,0,19.985,10.36Z"></path></svg>`
const ratingHalfImg = `<svg xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg" viewBox="3 3 18 18" aria-hidden="true" focusable="false" width="18" height="18"><path class="background" d="M12.007 16.97l4.21 2.95c.182.12.422.11.592-.027.17-.138.23-.37.15-.574l-1.484-5.33 4.306-3.073c.182-.12.265-.347.203-.557-.065-.21-.258-.352-.477-.352h-5.35l-1.67-5.642c-.06-.215-.257-.363-.48-.363-.225 0-.42.148-.482.363v12.94l.48-.335z" fill="#E1E3DF"></path><path class="foreground" d="M12 4c-.224 0-.42.15-.48.366l-1.67 5.642H4.5c-.218.002-.41.145-.472.354-.064.208.014.433.193.557l4.307 3.07-1.5 5.33c-.08.202-.02.433.15.57.17.14.41.15.59.03L12 16.98V4z" fill="#222222"></path></svg>`
const playBtn = `<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" aria-hidden="true" focusable="false"><polygon points="4 4 4 20 20 12 4 4"></polygon></svg>`

const wishList = `<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" aria-hidden="true" focusable="false"><path d="M12,21C10.349,21,2,14.688,2,9,2,5.579,4.364,3,7.5,3A6.912,6.912,0,0,1,12,5.051,6.953,6.953,0,0,1,16.5,3C19.636,3,22,5.579,22,9,22,14.688,13.651,21,12,21ZM7.5,5C5.472,5,4,6.683,4,9c0,4.108,6.432,9.325,8,10,1.564-.657,8-5.832,8-10,0-2.317-1.472-4-3.5-4-1.979,0-3.7,2.105-3.721,2.127L11.991,8.1,11.216,7.12C11.186,7.083,9.5,5,7.5,5Z" fill="#222222"></path></svg>`
const redWishList = `<svg xmlns:xlink="http://www.w3.org/1999/xlink" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" aria-hidden="true" focusable="false" width="24" height="24"><path d="M16.5,3A6.953,6.953,0,0,0,12,5.051,6.912,6.912,0,0,0,7.5,3C4.364,3,2,5.579,2,9c0,5.688,8.349,12,10,12S22,14.688,22,9C22,5.579,19.636,3,16.5,3Z" fill="#A61A2E"></path></svg>`
const popularGiftsList = [
  {
    imageURL: `https://i.etsystatic.com/35966576/c/1614/1283/669/351/il/e1510f/4033777789/il_340x270.4033777789_dqlw.jpg`,
    label:
      "Birth Flower jewelry Travel Case, Birth Month Flower Gift, Personalized Birthday Gift, Leather Jewelry Travel Case, Custom Jewelry Case",
    rating: 4.5,
    ratingCount: "(9,741)",
    currencySymbol: `₹`,
    price: "",
    oldPrice: 1709,
    offer: 50,
    delivery: "",
    playBtnImage: "",
    videoURL: "",
  },
  {
    imageURL: `https://i.etsystatic.com/25168585/c/2500/1987/0/181/il/214e7e/4589233930/il_340x270.4589233930_dg79.jpg`,
    label:
      "Custom Pet Portraits Using Pet Photo Personalized Digital Dog Portraits Cat Portraits Custom Dog Portraits Custom Pet Art Pet",
    rating: 5,
    ratingCount: "(11,431)",
    currencySymbol: `₹`,
    price: "",
    oldPrice: 1281,
    offer: 40,
    delivery: "",
    playBtnImage: playBtn,
    videoURL: `https://v-cg.etsystatic.com/video/upload/ac_none,du_15,q_auto:good/PAINT_PORTRAIT_ETSY_VIDEO_vo9waf.mp4`,
    
  },
  {
    imageURL: `https://i.etsystatic.com/32477306/c/2000/1589/0/256/il/0bcd64/3491080620/il_340x270.3491080620_oh18.jpg`,
    label:
      "Dainty Name Necklace with Birth Flower, Personalized Name Necklace, Custom Gold Name Jewelry, Birthday Gift for Her, Bridesmaid Gift",
    rating: 5,
    ratingCount: "(13,804)",
    currencySymbol: `₹`,
    price: "",
    oldPrice: 3321,
    offer: 50,
    delivery: "FREE delivery",
    playBtnImage: "",
    videoURL: "",
    
  },
  {
    imageURL: `https://i.etsystatic.com/27890741/c/2343/1862/320/560/il/31a0dd/4028709894/il_340x270.4028709894_i6tr.jpg`,
    label:
      "Heart Keychain Set - Made with Authentific LEGO® Bricks, Matching keychains, Gift Set for Couples, Best Friends - Very High Quality & DURABLE ",
    rating: 5,
    ratingCount: "(12,849)",
    currencySymbol: `₹`,
    price: "",
    oldPrice: 1451,
    offer: 50,
    delivery: "",
    playBtnImage: playBtn,
    videoURL: `https://v-cg.etsystatic.com/video/upload/ac_none,du_15,q_auto:good/HFF_Hearts_Video_m6nj4t.mp4`,
    
  },
  {
    imageURL: `https://i.etsystatic.com/28045281/r/il/3f41fa/3897994052/il_340x270.3897994052_l8xd.jpg`,
    label:
      "Sun catcher/ Crystal suncatcher/ Crystal Rainbow maker/ Aurora gemstone suncatcher/ crystal prism / wall hanging/ Home decor/ Gift 4 women",
    rating: 5,
    ratingCount: "(7001)",
    currencySymbol: "₹",
    price: "",
    oldPrice: 2650,
    offer: 10,
    delivery: "FREE delivery",
    playBtnImage: playBtn,
    videoURL: `https://v-cg.etsystatic.com/video/upload/ac_none,du_15,q_auto:good/Purple1_aal8ie.mp4`,
    
  },
  {
    imageURL: `https://i.etsystatic.com/26694795/c/2445/1943/282/0/il/035b01/3254592822/il_340x270.3254592822_5dss.jpg`,
    label:
      "Handmade Damascus Pocket Knife Rose Wood Handle Birthday Gift Anniversary Wedding Personalized Gift for Men ",
    rating: 5,
    ratingCount: "(6430)",
    currencySymbol: "₹",
    price: "",
    oldPrice: 7697,
    offer: 70,
    delivery: "",
    playBtnImage: playBtn,
    videoURL: `https://v-cg.etsystatic.com/video/upload/ac_none,du_15,q_auto:good/PB-42_convert-video-online.com_cfle3f.mp4`,
    
  },
]

const popularGiftsContainer = document.createElement("div")

popularGifts.appendChild(popularGiftsContainer)
popularGiftsContainer.classList.add("popular-gifts-container")
function createPopularGift(popularGiftsList) {
  for (let i = 0; i < popularGiftsList.length; i++) {
    const popularGiftsCardsContainer = document.createElement("div")
    popularGiftsContainer.appendChild(popularGiftsCardsContainer)
    popularGiftsCardsContainer.classList.add("popular-gift-card-container")

    const popularGiftsCards = document.createElement("div")
    popularGiftsCardsContainer.appendChild(popularGiftsCards)
    popularGiftsCards.classList.add("popular-gifts-cards")

    const popularGiftsCardsBody = document.createElement("div")
    popularGiftsCards.appendChild(popularGiftsCardsBody)
    popularGiftsCardsBody.classList.add("popular-gifts-cards-body")

    const popularGiftsCardsImg = document.createElement("div")
    popularGiftsCardsBody.appendChild(popularGiftsCardsImg)
    popularGiftsCardsImg.classList.add("popular-gifts-cards-img")

    const popularGiftImg = document.createElement("img")
    popularGiftsCardsImg.appendChild(popularGiftImg)
    popularGiftImg.src = popularGiftsList[i].imageURL

    const popularGiftCardContent = document.createElement("div")
    popularGiftsCardsBody.appendChild(popularGiftCardContent)
    popularGiftCardContent.classList.add("popular-gift-card-content")

    const popularGiftContentLabel = document.createElement("h3")
    popularGiftCardContent.appendChild(popularGiftContentLabel)
    popularGiftContentLabel.innerHTML = popularGiftsList[i].label

    const popularGiftContentRating = document.createElement("div")
    popularGiftCardContent.appendChild(popularGiftContentRating)
    popularGiftContentRating.classList.add("rating-container")

    const popularRatingIcon = document.createElement("span")
    popularGiftContentRating.appendChild(popularRatingIcon)

    const popularRatingCount = document.createElement("span")
    popularGiftContentRating.appendChild(popularRatingCount)
    popularRatingCount.classList.add("rating-count")
    popularRatingCount.innerHTML = popularGiftsList[i].ratingCount

    const popularGiftAmount = document.createElement("div")
    popularGiftCardContent.appendChild(popularGiftAmount)
    popularGiftAmount.classList.add("popular-gift-amount")

    const popularGiftAmountIcon = document.createElement("span")
    popularGiftAmount.appendChild(popularGiftAmountIcon)
    popularGiftAmountIcon.classList.add("popular-gift-amount-icon")
    popularGiftAmountIcon.innerHTML = popularGiftsList[i].currencySymbol

    const popularGiftPrice = document.createElement("span")
    popularGiftAmount.appendChild(popularGiftPrice)
    popularGiftPrice.classList.add("gift-price")
    popularGiftPrice.innerHTML = Math.floor(
      (popularGiftsList[i].oldPrice / 100) * (100 - popularGiftsList[i].offer)
    )

    const popularGiftOldAmount = document.createElement("span")
    popularGiftAmount.appendChild(popularGiftOldAmount)
    popularGiftOldAmount.classList.add("popular-gift-old-amount")

    const popularGiftCurrencyOld = document.createElement("span")
    popularGiftOldAmount.appendChild(popularGiftCurrencyOld)
    popularGiftCurrencyOld.innerHTML = popularGiftsList[i].currencySymbol

    const popularGiftOldPrice = document.createElement("span")
    popularGiftOldAmount.appendChild(popularGiftOldPrice)
    popularGiftOldPrice.innerHTML = popularGiftsList[i].oldPrice

    const popularGiftOffer = document.createElement("span")
    popularGiftAmount.appendChild(popularGiftOffer)
    popularGiftOffer.classList.add("popular-gift-offer")
    popularGiftOffer.innerHTML = `(${popularGiftsList[i].offer}% off )`

    const popularGiftWishList = document.createElement("button")
    popularGiftsCardsImg.appendChild(popularGiftWishList)
    popularGiftWishList.classList.add("popular-gift-wish-list")

    const popularWishListImg = document.createElement("span")
    popularGiftWishList.appendChild(popularWishListImg)
    popularWishListImg.classList.add("popular-wish-list-img")
    popularWishListImg.innerHTML = wishList
    state=0
    popularWishListImg.addEventListener("click", () => {

      if(state===0){
        popularWishListImg.innerHTML = wishList
        state=1
      }else {
        popularWishListImg.innerHTML = redWishList
        state=0
      }
    })



    if (popularGiftsList[i].playBtnImage !== "") {
      const popularGiftPlayBtn = document.createElement("div")
      popularGiftsCardsImg.appendChild(popularGiftPlayBtn)
      popularGiftPlayBtn.classList.add("popular-gift-play-btn")

      const popularGiftPlayBtnImg = document.createElement("span")
      popularGiftPlayBtn.appendChild(popularGiftPlayBtnImg)
      popularGiftPlayBtnImg.innerHTML = popularGiftsList[i].playBtnImage
    }

    if (popularGiftsList[i].videoURL !== "") {
      const popularGiftCardVideo = document.createElement("video")
      popularGiftsCardsImg.appendChild(popularGiftCardVideo)
      popularGiftCardVideo.classList.add("gift-card-video")
      popularGiftCardVideo.src = popularGiftsList[i].videoURL
      popularGiftCardVideo.addEventListener("mouseenter", () => {
        popularGiftCardVideo.autoplay = false
        popularGiftCardVideo.muted = "muted"
        popularGiftCardVideo.play()

      })
    }

    if (popularGiftsList[i].delivery !== "") {
      const popularGiftFreeDelivery = document.createElement("div")
      popularGiftCardContent.appendChild(popularGiftFreeDelivery)
      popularGiftFreeDelivery.classList.add("free-delivery")

      const popularGiftFreeDeliveryText = document.createElement("p")
      popularGiftFreeDelivery.appendChild(popularGiftFreeDeliveryText)
      popularGiftFreeDeliveryText.innerHTML = popularGiftsList[i].delivery
    }

    if (popularGiftsList[i].rating % 1 === 0) {
      popularRatingIcon.innerHTML = ratingFullImg.repeat(
        popularGiftsList[i].rating
      )
    } else {
      popularRatingIcon.innerHTML =
        ratingFullImg.repeat(Math.floor(popularGiftsList[i].rating)) +
        ratingHalfImg
      console.log(ratingFullImg.repeat(Math.floor(popularGiftsList[i].rating)))
    }
  }
}
createPopularGift(popularGiftsList)

const footerBodyContentsBtn = document.querySelectorAll('.footer-body-contents-btn')
const contentsInsideFooterBody = document.querySelectorAll('.contents-inside-footer-body')
const  toggleArrow = document.querySelectorAll('.toggle-arrow')

footerBodyContentsBtn.forEach((num,idx) => {
  num.addEventListener("click",  () =>{

  contentsInsideFooterBody[idx].classList.toggle('active')

  toggleArrow[idx].classList.toggle('rotate')
 
 
console.log(contentsInsideFooterBody[idx].classList.contains('active'));
  })
});

