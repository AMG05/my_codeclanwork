import pdb 
from models.album import Album
from models.artist import Artist
import repositories.album_repository as album_repository 
import repositories.artist_repository as artist_repository 

album_repository.delete_all()
artist_repository.delete_all()

album1 = Album("Bleach", "Rock", "Nirvana")
album_repository.save(album1)
album2 = Album("Lemondade", "Pop", "Beyonce")
album_repository.save(album2)
album3 = Album("21", "Pop", "Adele")
album_repository.save(album3)

artist1 = Artist("Nirvana")
artist_repository.save(artist1)
artist2 = Artist("Beyonce")
artist_repository.save(artist2)
artist3 = Artist("Adele")
artist_repository.save(artist3)

found_albums = artist_repository.albums(artist1)

pdb.set_trace()