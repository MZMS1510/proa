const Header = () => {

    return (
        <header className="bg-[url('public/images/guitarras_header.jpg')] bg-cover h-56">
            <nav className="relative">
                <ul className="flex flex-row absolute right-16 top-40">
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center">Home</li>
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center">Quem Somos</li>
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center">Instrumentos</li>
                    <li className="bg-white text-amber-950 px-8 py-2 hover:cursor-pointer hover:translate-y-2 transition-all text-center">Endereço</li>
                </ul>
            </nav>
        </header>
    )
}

export default Header;