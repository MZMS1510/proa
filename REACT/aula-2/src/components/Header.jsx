import logo from "../assets/images/viagens.jpg";

const Header = () => {
  return (
    <nav className="nav-bar">
      <img src={logo} alt="viagens logo" />

      <a href="#">Viagem 1</a>
      <a href="#">Viagem 2</a>
      <a href="#">Viagem 3</a>
      <a href="#">Viagem 4</a>
    </nav>
  );
};

export default Header;
