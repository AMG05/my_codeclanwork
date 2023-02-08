def spin_words(sentence):
    split_words = sentence.split(' ')
    processed_words = []

    for word in split_words:
        if len(word) >=5:
            # we use list comprehension [<start>:<stop>:<step>]
            # with a step of -1 to tell Python we want to iterate each index by -1, e.g. reverse order
            processed_words.append(word[::-1])
        else:
            processed_words.append(word)
    
    return ' '.join(processed_words)


assert spin_words('Hello my name is Timothy') == 'olleH my name is yhtomiT'