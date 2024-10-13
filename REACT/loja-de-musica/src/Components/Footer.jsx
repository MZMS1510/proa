export const Footer = () => {
    return (
        <footer className="bg-black text-white text-center">
            <h3 className="font-bold">Nossa Loja - Instrumentos Musicais</h3>
            <p>Rua Tito, 54 - Lapa</p>
            <p>São Paulo - Brasil</p>
            <div className="flex justify-center gap-6 m-auto w-[40%]">
                <img className="w-[20%]" src="public/images/whats.png" alt="rede social" />
                <img className="w-[20%]" src="public/images/insta.png" alt="rede social" />
                <img className="w-[20%]" src="public/images/face.png" alt="rede social" />
            </div>
        </footer>
    )
}