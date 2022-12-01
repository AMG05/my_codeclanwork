from db.run_sql import run_sql
from models.album import Album

def select_all():
    albums = []

    sql = "SELECT * FROM albums"
    results = run_sql(sql)

    for row in results:
        album = Album(row['title'], row['genre'], row['artist'], row['id'])
        albums.append(album)
    return albums

def save(album):
    sql = f"INSERT INTO albums (title, artist, genre, id) VALUES (%s, %s, %s) RETURNING *"
    values = [album.title, album.artist, album.genre]
    results = run_sql(sql, values)
    id = results[0]['id']
    album.id = id
    return album

def select(id):
    album = None
    sql = "SELECT * FROM albums WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)
    if results:
        result = results[0]
        album = Album(result['title'], result['artist'], result['genre'], result ['id'])
    return album

def delete_all():
    sql = "DELETE FROM albums"
    run_sql(sql)

def update(album):
    sql = "UPDATE tasks SET (title, artist, genre, id) = (%s, %s, %s, %s) WHERE id = %s"
    values = [album.title, album.artist, album.genre, album.id]
    run_sql(sql, values)

