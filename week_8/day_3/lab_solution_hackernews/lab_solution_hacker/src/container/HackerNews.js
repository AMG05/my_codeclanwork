import { useEffect , useState } from "react";
import Filter from "../components/Filter";
import StoryList from "../components/StoryList";




const HackerNews = () => {
    const [stories, setStories] = useState([]);
    const [filteredStories, setFilteredStories] = useState([]);


    const filterData = (searchTerm) => {
        const filteredData = stories.filter(story => {
            return story.title.includes(searchTerm);
        });

        setFilteredStories(filteredData);
    }

    useEffect(() => {
        fetch('https://hacker-news.firebaseio.com/v0/topstories.json')
        .then(response => response.json())
        .then(storyIds => {
            const storyPromises = storyIds.slice(0, 20).map(storyId => {
                return fetch(`https://hacker-news.firebaseio.com/v0/item/${storyId}.json`)
                .then(response => response.json())
            });

            Promise.all(storyPromises)
            .then(storyData => {
                setStories(storyData);
                setFilteredStories(storyData);

                })
        })
    }, [])

    return (
        <>

        <Filter filterData={filterData}/>
        <h1>Hacker News!</h1>
        <StoryList storyData={filteredStories}/>
        </>
    )
}

export default HackerNews;