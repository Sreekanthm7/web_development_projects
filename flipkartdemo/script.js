const navContainer = document.querySelector(".nav-container")
const navList = document.querySelector(".nav-list")
const navTotalList = document.querySelector(".nav-total-list")

const arrowImg = `<svg xmlns:xlink="http://www.w3.org/1999/xlink" width="4.7" height="8" viewBox="0 0 16 27" xmlns="http://www.w3.org/2000/svg" class="RWB9Wm"><path d="M16 23.207L6.11 13.161 16 3.093 12.955 0 0 13.161l12.955 13.161z" fill="#878787" class="_2JzwqO"></path></svg>`

const navListData = [
  {
    label: "Electronics",
    imageURL: arrowImg,
  },
  {
    label: "TVs & Appliances",
    imageURL: arrowImg,
  },
  {
    label: "Men",
    imageURL: arrowImg,
  },
  {
    label: "Women",
    imageURL: arrowImg,
  },
  {
    label: "Baby & kids",
    imageURL: arrowImg,
  },
  {
    label: "Home & Furniture",
    imageURL: arrowImg,
  },
  {
    label: "Sports, Books & More",
    imageURL: arrowImg,
  },
  {
    label: "Flights",
    imageURL: "",
  },
  {
    label: "Offer Zone",
    imageURL: "",
  },
]

let navBar = navListData.map(function (item) {
  console.log(item)
  const html = `
      <li>
        <p>${item.label}</p>
        ${item.imageURL}
      </li>
  `
  return html
})

console.log(navBar.join(""))

navTotalList.innerHTML = navBar.join("")

const mobileListData = [
  {
    name: "APPLE iPHONE 13 (Midnight, 128 GB)",
    photo: "assets/img/iphone13.webp",
    type: "iphone",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.7,
    stars: "stars.svg",
    reviews: "2,00,969 Ratings & 10,919 Reviews",
    specifications: {
      one: "128 GB ROM",
      two: "15.49 cm (6.1 inch) Super Retina XDR Display",
      three: "12MP + 12MP | 12MP Front Camera",
      four: "A15 Bionic Chip Processor",
      five: "Brand Warranty for 1 Year",
    },
    actualPrice: 58999,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 15,
    rupee: "&#8377;",
  },
  {
    name: "APPLE iPHONE 13 (Blue, 128 GB)",
    photo: "assets/img/iphone13blue.webp",
    type: "iphone",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.6,
    stars: "stars.svg",
    reviews: "2,01,019 Ratings & 10,920 Reviews",
    specifications: {
      one: "128 GB ROM",
      two: "15.49 cm (6.1 inch) Super Retina XDR Display",
      three: "12MP + 12MP | 12MP Front Camera",
      four: "A15 Bionic Chip Processor",
      five: "Brand Warranty for 1 Year",
    },
    actualPrice: 58999,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 15,
    rupee: "&#8377;",
  },

  {
    name: "SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)",
    photo: "assets/img/samsungf13.webp",
    type: "samsung",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.4,
    stars: "stars.svg",
    reviews: "1,37,239 Ratings & 7,920 Reviews",
    specifications: {
      one: "4 GB RAM | 128 GB ROM | Expandable Upto 1 TB",
      two: "16.76 cm (6.6 inch) Full HD+ Display",
      three: "50MP + 5MP + 2MP | 8MP Front Camera",
      four: "6000mAh Lithium Ion Battery",
      five: "Exynos 850 Processor",
    },
    actualPrice: 10999,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 26,
    rupee: "&#8377;",
  },

  {
    name: "APPLE iPHONE 14 Plus (Purple, 128 GB)",
    photo: "assets/img/iphone14plus.webp",
    type: "iphone",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.7,
    stars: "stars.svg",
    reviews: "8,521 Ratings & 532 Reviews",
    specifications: {
      one: "128 GB ROM",
      two: "17.02 cm (6.7 inch) Super Retina XDR Display",
      three: "12MP + 12MP | 12MP Front Camera",
      four: "A15 Bionic Chip, 6 Core Processor Processor",
      five: "1 Year Warranty for Phone and 6 Months Warranty for In-Box Accessories",
    },
    actualPrice: 79999,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 11,
    rupee: "&#8377;",
  },

  {
    name: "SAMSUNG Galaxy F23 5G (Copper Blush, 128 GB)",
    photo: "assets/img/samsungf23.webp",
    type: "samsung",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.3,
    stars: "stars.svg",
    reviews: "1,78,707 Ratings & 14,008 Reviews",
    specifications: {
      one: "6 GB RAM | 128 GB ROM | Expandable Upto 1 TB",
      two: "16.76 cm (6.6 inch) Full HD+ Display",
      three: "50MP + 8MP + 2MP | 8MP Front Camera",
      four: "5000mAh Lithium Ion Battery",
      five: "Qualcomm Snapdragon 750 Processor",
    },
    actualPrice: 15999,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 26,
    rupee: "&#8377;",
  },
  {
    name: "SAMSUNG Galaxy F14 5G (GOAT Gree119999n, 128 GB)",
    photo: "assets/img/samsungf14.webp",
    type: "samsung",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.2,
    stars: "stars.svg",
    reviews: "1,437 Ratings & 137 Reviews",
    specifications: {
      one: "4 GB RAM | 128 GB ROM | Expandable Upto 1 TB",
      two: "16.76 cm (6.6 inch) Full HD+ Display",
      three: "50MP + 2MP | 13MP Front Camera",
      four: "6000mAh Battery",
      five: "Exynos 1330, Octa Core Processor",
    },
    actualPrice: 14490,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 17,
    rupee: "&#8377;",
  },
  {
    name: "APPLE iPHONE 14 Pro (Purple, 128 GB)",
    photo: "assets/img/iphone14pro.jpeg",
    type: "iphone",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.7,
    stars: "stars.svg",
    reviews: "1,017 Ratings & 81 Reviews",
    specifications: {
      one: "128 GB ROM",
      two: "15.49 cm (6.1 inch) Super Retina XDR Display",
      three: "48MP + 12MP + 12MP | 12MP Front Camera",
      four: "A16 Bionic Chip, 6 Core Processor Processor",
      five: "1 Year Warranty for Phone and 6 Months Warranty for In-Box Accessories",
    },
    actualPrice: 119999,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 7,
    rupee: "&#8377;",
  },
  {
    name: "APPLE iPHONE 12 mini (Black, 64 GB)",
    photo: "assets/img/iphonemini.webp",
    type: "iphone",
    compare: "Add to Compare",
    favorite: "heart.svg",
    rating: 4.5,
    stars: "stars.svg",
    reviews: "1,27,317 Ratings & 10,196 Reviews",
    specifications: {
      one: "64 GB ROM",
      two: "13.72 cm (5.4 inch) Super Retina XDR Display",
      three: "12MP + 12MP | 12MP Front Camera",
      four: "A14 Bionic Chip with Next Generation Neural Engine Processor",
      five: "Ceramic Shield",
    },
    actualPrice: 50999,
    price: "",
    assured: "assets/img/flipassured.png",
    discount: 14,
    rupee: "&#8377;",
  },
]

mobileContainer = document.querySelector(".mobile-container")

let mobileList = mobileListData.map(function (item) {
  let html = `
 <div class = "mobile-content">
  <div class="mobile-left-container">
    <div class="mobile-img-container">
      <img src=${item.photo} alt="">
    </div>
    <div class="add-to-compare-container">
      <label class="add-to-compare-checkbox">
        <input type="checkbox">
      </label>
      <label class="add-to-compare-text">
        <span>${item.compare}</span>
      </label>
    </div>
    <div class="mobile-fav"> 
      <img src=${item.favorite} alt="">
    </div>
  </div>
  <div class="mobile-right-container">
    <div class="mobile-text-container">
      <div class="mobile-name">
        ${item.name}
      </div>
      <div class="rating-review">
        <div class="mobile-rating">
          <p>${item.rating}</p>
          <img src=${item.stars} alt="">
        </div>
        <div class="mobile-review">
          <p>${item.reviews}</p>
        </div>
      </div>
      <div class="mobile-specification">
        <ul>
          <li>${item.specifications.one}</li>
          <li>${item.specifications.two}</li>
          <li>${item.specifications.three}</li>
          <li>${item.specifications.four}</li>
          <li>${item.specifications.five}</li>
        </ul>
      </div>
    </div>
    <div class="mobile-price-container">
      <div class="mobile-price">
        <div class="mobile-price-text">
          <p>${item.rupee}</p>
          <span>${
            item.actualPrice -
            Math.ceil((item.actualPrice * item.discount) / 100)
          }</span>
        </div>
        <div class="price-offer">
          <div class="orginal-price">
            <span>${item.rupee}</span>
            <span>${item.actualPrice}</span>
          </div>
          <div class="offer">
            <span>${item.discount}% off</span>

          </div>
        </div>
      </div>  
      <div class="flipkart-assured-img">
        <img src=${item.assured} alt="">
      </div>

    </div>
  </div>
  </div>
  `
  return html
})

mobileContainer.innerHTML = mobileList.join("")
