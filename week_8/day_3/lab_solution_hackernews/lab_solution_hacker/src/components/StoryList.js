import StoryItem from "./StoryItems";

const StoryList = ({storyData}) => {
    const storyItemNodes = storyData.map((story, index) => {
        return <StoryItem key={index} story={story}/>
    })



    return (
        <ul>
            {storyItemNodes}
        </ul>
    )
}




export default StoryList;