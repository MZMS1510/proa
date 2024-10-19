import { Route, Routes } from "react-router-dom"
import { Footer } from "./Components/Footer"
import Header from "./Components/Header"
import Section from "./Components/Section"

import Home from "./Components/pages/Home"
import Instrumentos from "./Components/pages/Instrumentos"
import Endereco from "./Components/pages/Endereco"

function App() {

  return (
    <main className="flex flex-col gap-5 w-[80%] m-auto bg-pink-900">
      <Header />
      <Routes>
        <Route path="/" Component={Home} />
        <Route path="/quem-somos" Component={Home} />
        <Route path="/instrumentos" Component={Instrumentos} />
        <Route path="/endereco" Component={Endereco} />
      </Routes>

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
