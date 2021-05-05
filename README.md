# Trie Java Implementation

This is a simple Java program to demonstrate how to create a binary 
search tree and perform the following operations:

- add a node to the BST
- delete a node from the BST 

## Output

```shell script
Adding node 50
50
---------------------
Adding node 25
50
└──25
---------------------
Adding node 75
50
├──25
└──75
---------------------
Adding node 40
50
├──25
│  └──40
└──75
---------------------
Adding node 10
50
├──25
│  ├──10
│  └──40
└──75
---------------------
Adding node 80
50
├──25
│  ├──10
│  └──40
└──75
   └──80
---------------------
Adding node 60
50
├──25
│  ├──10
│  └──40
└──75
   ├──60
   └──80
---------------------
Deleting 60
50
├──25
│  ├──10
│  └──40
└──75
   └──80
---------------------
Deleting 75
50
├──25
│  ├──10
│  └──40
└──80
---------------------
Deleting 50
40
├──25
│  └──10
└──80
---------------------
```