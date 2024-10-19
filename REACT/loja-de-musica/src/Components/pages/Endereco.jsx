import Section from "../Section"
import Rectangle from "../Rectangle"

const Endereco = () => {
    return (
        <Section color={"wine"}>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3700.9915479992596!2d-46.69433512452555!3d-23.528080960370776!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94cef8775663b04f%3A0x923835e9005f8309!2sSenac%20Lapa%20Tito!5e1!3m2!1spt-BR!2sbr!4v1728833395393!5m2!1spt-BR!2sbr" width="40%" loading="lazy" referrerPolicy="no-referrer-when-downgrade"></iframe>

            <Rectangle
                title={"Nossa Loja - Instrumentos Musicais"}
                text={"Está situada na Rua Tito, 54 - Pompéia, próximo ao teatro Cacilda Becker, em uma construção do século XIX, numa área de 500m2, com uma variada gama de instrumentos, em um ambiente agradável para toda a família!"}
                color={"brown"}
            />
        </Section>
    );
}

export default Endereco