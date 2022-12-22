import React, { useState, useEffect} from 'react';
import SongsList from '../components/SongsList'
import './SongsContainer.css';
// import SongsDetail from '..components/SongsDetail'


const SongsContainer = () => {
    const [songs, setSongs] = useState([]);

    useEffect(() => {
        getSongs();
      }, [])



    const getSongs = function(){
        fetch('https://itunes.apple.com/gb/rss/topsongs/limit=20/json')
        .then(res => res.json())
        .then(songs => setSongs(songs.feed.entry))
    }
 
    return (
        <div className="main-container">
        {<SongsList songs={songs}/>}
        </div>

 )
    

}

export default SongsContainer;
