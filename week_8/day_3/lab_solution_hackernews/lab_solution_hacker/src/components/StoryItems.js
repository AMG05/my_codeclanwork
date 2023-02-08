const StoryItem = ({story}) => {
    return (
        <li>
            <h3>{story.title}</h3>
            <p>{story.by}</p>
        </li>
    )
}

export default StoryItem;