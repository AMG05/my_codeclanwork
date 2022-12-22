import React from 'react';
import SongsDetail from './SongsDetail'
import './SongsList.css';

const SongsList = ({songs}) => {

    const SongsItems = songs.map((song, index) => {
        return <SongsDetail song = {song} key={index} />
      })
  
    return (
      <div className='song-list'>
      <ul>
        {SongsItems}
      </ul>
    </div>
    )
  }

  

  export default SongsList;

