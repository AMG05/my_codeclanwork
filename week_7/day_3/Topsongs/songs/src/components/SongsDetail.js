import './SongsDetail.css';

const SongsDetail = ({song}) => {

    return (

        <li className="song-list"><h2>{song['im:name'].label}</h2><p>{song['im:artist'].label}</p><br></br>
        {song.category.attributes['im:id']}</li>
    )}
  



export default SongsDetail;
