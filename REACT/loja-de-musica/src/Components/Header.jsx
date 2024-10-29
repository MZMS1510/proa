import { Link } from "react-router-dom";

const Header = () => {

    return (
        <header className="bg-[url('public/images/guitarras_header.jpg')] bg-cover h-56">
            <nav className="relative">
                <ul className="flex flex-row absolute right-16 top-40">
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center"><Link to={'/'}>Home</Link></li>
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center"><Link to={'/'}>Quem Somos</Link></li>
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center"><Link to={'/instrumentos'}>Instrumentos</Link></li>
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center"><Link to={'/endereco'}>Endereço</Link></li>
                </ul>
            </nav>
        </header>
    )
}

export default Header;