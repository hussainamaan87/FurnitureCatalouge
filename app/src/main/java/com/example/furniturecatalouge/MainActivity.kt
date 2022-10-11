package com.example.furniturecatalouge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furniturecatalouge.ui.theme.FurnitureCatalougeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FurnitureCatalougeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DefaultPreview()
                }
            }
        }
    }
}

@Composable
fun ProductDefault(
    painter_pd: Painter,
    description_pd: String,
    name_pd: String
){
    Card(
        shape= RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        modifier = Modifier
            .width(200.dp)
            .height(300.dp)
            .padding(20.dp)
            .background(Color.White)

    ) {
        Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painter_pd,
                contentDescription = description_pd,
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape))
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = name_pd,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun ProductItem(
    painter_it: Painter,
    description_it: String,
    name_it: String,
    cost_it: String,
    product_descp : String
){
    Card (
        shape= RoundedCornerShape(20.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        modifier = Modifier
            .width(400.dp)
            .height(300.dp)
            .padding(20.dp)
            .background(Color.White)
    ){
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.background(Color.White)) {
            Card(shape= RoundedCornerShape(20.dp),
            modifier = Modifier.fillMaxSize()
                .weight(3f)) {
                Image(
                    painter = painter_it,
                    contentDescription = description_it,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxHeight())
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(2f)
                    .background(Color.White)
                    .padding(20.dp)){
                Text(
                    text = name_it,
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2)
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = product_descp,
                    fontSize = 8.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Justify,
                    maxLines = 5)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = cost_it,
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun Screen1(){
//SOFA
    val SofaImage = arrayOf(
        painterResource(id = R.drawable.s1),
        painterResource(id = R.drawable.s2),
        painterResource(id = R.drawable.s3),
        painterResource(id = R.drawable.s4),
        painterResource(id = R.drawable.s5))
    val SofaName = arrayOf("Product 1","Product 2","Product 3","Product 4","Product 5")
    val SofaCost = arrayOf("$399","$299","$499","$199","$299")
    val SofaDescription = arrayOf("It is sturdily built offering quality, hardiness, and comfort for long-lasting use",
        "Lightweight enough to be moved around single handedly. Constructed with higher quality raw",
        "Fabric does not lose colour with rubbing; surpassed 30+ tests to ensure quality;Durability tested with 100 kg on each seat and backrest for 25,000 cycles",
        "Lightweight with good ground clearance for easy shifting and tidying up;3-year limited warranty against manufacturing defects",
        "Made with Solid Wood Frame and high density foam; Upholstery material: Fabric, Leg Material: fibre legs, durability-tested with 110 kg on individual seats.")
//CUPBOARD
    val CupboardImage = arrayOf(
        painterResource(id = R.drawable.c1),
        painterResource(id = R.drawable.c2),
        painterResource(id = R.drawable.c3),
        painterResource(id = R.drawable.c4),
        painterResource(id = R.drawable.c5))
    val CupboardName = arrayOf("Product 1","Product 2","Product 3","Product 4","Product 5")
    val CupboardCost = arrayOf("$299","$199","$299","$199","$299")
    val CupboardDescription = arrayOf("3-door foldable wardrobe with sturdy steel metal pipes frame;Corrosion-free metal parts and high-quality plastic components",
        "Brown outer cover with premium-quality and long-lasting zippers;8 non-woven brown shelves/racks made from 100 GSM fabric",
        "Side pockets for storing small accessories;Load capacity of each rack: 10 kg. Hanger load capacity: 4 kg (20 shirts)",
        "Beautifully designed and innovatively crafted modern design. With Movable clothes hanging rod and 8 storage shelves",
        "Made from strong and durable material. Portable & light weight easy to carry and put any where.")
//TABLE
    val TableImage = arrayOf(
        painterResource(id = R.drawable.t1),
        painterResource(id = R.drawable.t2),
        painterResource(id = R.drawable.t3),
        painterResource(id = R.drawable.t4),
        painterResource(id = R.drawable.t5))
    val TableName = arrayOf("Product 1","Product 2","Product 3","Product 4","Product 5")
    val TableCost = arrayOf("$99","$199","$99","$199","$99")
    val TableDescription = arrayOf("UNIQUE & ELEGANT: Give your home a luxurious look with this wood tea/coffee table. ",
        "This Wooden Coffee table can be placed in the living room, great room, bedroom, entrance, hallway, or window side to liven up your space instantly. ",
        "This luxury table can be used for more than one purpose, such as a coffee table, kids study table, utility table, breakfast table",
        "This splendid style of wooden coffee table set create a beautiful impression with perception of modernization.",
        "This versatile set is the perfect option for those who looking for additional space as well as style. ")

//BED
    val BedImage = arrayOf(
        painterResource(id = R.drawable.b1),
        painterResource(id = R.drawable.b2),
        painterResource(id = R.drawable.b3),
        painterResource(id = R.drawable.b4),
        painterResource(id = R.drawable.b5))
    val BedName = arrayOf("Product 1","Product 2","Product 3","Product 4","Product 5")
    val BedCost = arrayOf("$399","$299","$499","$199","$299")
    val BedDescription = arrayOf("Underwent dynamic loading testing; durability tested for 100 kg over 10,000 cycles and rigorously bed-edge stability tested for 100 kg over 1,000 cycles",
        "Warranty Description: 3 Years against manufacturing defects" +
                "Compatible Mattress Size: 78X60 Inches, without Storage",
        "Made with Solid Sheesham Wood, with a Honey Finish",
        "Premium Engineered Wood Construction | Ample Headboard & Box Stoarge",
        "1 Year Warranty On Manyfacturing Defectas Only| Free Delivery & Assembly")

    Column(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .background(Color.White)) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ){
            Text(
                text = "Best Furniture For Your Home",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "FURNITURE CATALOGUE",
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
            )
        }
        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(20.dp)
        ){ Image(
            painter = painterResource(id = R.drawable.homeimage),
            contentDescription = "NUll",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize())
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
            Text(
                text = "SOFA COLLECTIONS",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            ) {
            ProductDefault(painter_pd = painterResource(id = R.drawable.icon2), description_pd = "null", name_pd = "SOFA")
            for (x in 0..4) {
                ProductItem(
                    painter_it = SofaImage[x],
                    description_it = "null",
                    name_it = SofaName[x],
                    cost_it = SofaCost[x],
                    product_descp = SofaDescription[x]
                )
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
            Text(
                text = "CUPBOARD COLLECTIONS",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
        ) {
            ProductDefault(painter_pd = painterResource(id = R.drawable.icon4), description_pd = "null", name_pd = "CUPBOARD")
            for (x in 0..4) {
                ProductItem(
                    painter_it = CupboardImage[x],
                    description_it = "null",
                    name_it = CupboardName[x],
                    cost_it = CupboardCost[x],
                    product_descp = CupboardDescription[x]
                )
            }
        }

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
            Text(
                text = "TABLE COLLECTIONS",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
        ) {
            ProductDefault(painter_pd = painterResource(id = R.drawable.icon3), description_pd = "null", name_pd = "TABLE")
            for (x in 0..4) {
                ProductItem(
                    painter_it = TableImage[x],
                    description_it = "null",
                    name_it = TableName[x],
                    cost_it = TableCost[x],
                    product_descp = TableDescription[x]
                )
            }
        }


        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)) {
            Text(
                text = "BED COLLECTIONS",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
        ) {
            ProductDefault(painter_pd = painterResource(id = R.drawable.icon1), description_pd = "null", name_pd = "BED")
            for (x in 0..4) {
                ProductItem(
                    painter_it = BedImage[x],
                    description_it = "null",
                    name_it = BedName[x],
                    cost_it = BedCost[x],
                    product_descp = BedDescription[x]
                )
            }
        }




    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FurnitureCatalougeTheme {
        //ProductDefault(painter_pd = painterResource(id = R.drawable.ic_launcher_background), description_pd = "null", name_pd = "SOFA")
        //ProductItem(painter_it = painterResource(id = R.drawable.s1), description_it = "null", name_it = "Sample name", cost_it = "$49", product_descp = "Lorem Ipsum Dolor asdfasd asgrargf arraewf asfwegf sdffg aergaer aerfaer aergaerg")
        Screen1()
    }
}