import { Footer } from "./Components/Footer"
import Guitar from "./Components/Guitar"
import Header from "./Components/Header"
import Rectangle from "./Components/Rectangle"
import Section from "./Components/Section"

function App() {

  return (
    <main className="flex flex-col gap-5 w-[80%] m-auto bg-pink-900">
      <Header />
      <Section color={"red"}>
        <Rectangle
          title={"Nossa Loja - Instrumentos Musicais"}
          text={"Lorem ipsum, dolor sit amet consectetur adipisicing elit. Nisi nam amet laborum iure hic velit voluptas adipisci blanditiis, illo sint, inventore, repellat asperiores porro ipsa quos. Alias repellendus tempora non?Lorem ipsum dolor, sit amet consectetur adipisicing elit. Consectetur quisquam doloribus perspiciatis ratione"}
          color={"pink"} />
        <img src="public/images/loja.jpg" alt="loja de instrumentos" width={"40%"} />
      </Section>

      <Section color={"white"}>
        <Guitar />
        <Guitar />
        <Guitar />
        <Guitar />
      </Section>

      <Section color={"wine"}>
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3700.9915479992596!2d-46.69433512452555!3d-23.528080960370776!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94cef8775663b04f%3A0x923835e9005f8309!2sSenac%20Lapa%20Tito!5e1!3m2!1spt-BR!2sbr!4v1728833395393!5m2!1spt-BR!2sbr" width="40%" loading="lazy" referrerPolicy="no-referrer-when-downgrade"></iframe>

        <Rectangle
          title={"Nossa Loja - Instrumentos Musicais"}
          text={"Está situada na Rua Tito, 54 - Pompéia, próximo ao teatro Cacilda Becker, em uma construção do século XIX, numa área de 500m2, com uma variada gama de instrumentos, em um ambiente agradável para toda a família!"}
          color={"brown"}
        />
      </Section>

      <Section color={"white"}>
        <form className="w-[40%]">
          <label htmlFor="name">Seu nome:</label>
          <input className="input-text" type="text" id="name" placeholder="Débora Paixão" />

          <label htmlFor="email">Seu email:</label>
          <input className="input-text" type="email" id="email" placeholder="Débora Paixão" />

          <textarea className="border border-gray-500 rounded-md w-full h-16 my-2" name="comment" id="comment" placeholder="Faça seu pedido aqui"></textarea>

          <input className="bg-gray-200 w-full border-2 border-gray-500 py-2 rounded-md hover:bg-gray-400 hover:cursor-pointer" type="submit" value={"Fazer consulta"} />
        </form>

        <div className="flex flex-col justify-center w-[40%] text-center">
          <h2 className="font-bold text-2xl text-blue-500">
            Acesse também nossas redes sociais:
          </h2>
          <div>
            <img className="relative float-left m-2 w-[30%] h-[150px]" src="public/images/whats.png" alt="rede social" />
            <img className="relative float-left m-2 w-[30%]" src="public/images/insta.png" alt="rede social" />
            <img className="relative float-left m-2 w-[30%]" src="public/images/face.png" alt="rede social" />
          </div>
        </div>
      </Section>

      <Footer />
    </main>
  )
}

export default App
