import Rectangle from "../Rectangle"
import Section from "../Section"

const Home = () => {
    return (
        <Section color={"red"}>
            <Rectangle
                title={"Nossa Loja - Instrumentos Musicais"}
                text={"Lorem ipsum, dolor sit amet consectetur adipisicing elit. Nisi nam amet laborum iure hic velit voluptas adipisci blanditiis, illo sint, inventore, repellat asperiores porro ipsa quos. Alias repellendus tempora non?Lorem ipsum dolor, sit amet consectetur adipisicing elit. Consectetur quisquam doloribus perspiciatis ratione"}
                color={"pink"} />
            <img src="public/images/loja.jpg" alt="loja de instrumentos" width={"40%"} />
        </Section>
    )
}

export default Home;