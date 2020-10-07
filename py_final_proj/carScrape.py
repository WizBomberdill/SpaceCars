# -*- coding: utf-8 -*-
"""
Created on Sun Mar  8 08:56:18 2020

@author: thoma
"""



"""this app will take some information that is on the web


    and display it in a interesting way."""
import pygame
import random

#import os



pygame.init()
"""creating a screen"""
screen = pygame.display.set_mode([800,800])
"""screen size starts top left corner"""

"""Titles and Icon"""
pygame.display.set_caption("CarSpace")
icon = pygame.image.load("van.png")
pygame.display.set_icon(icon)


#player
playerImg = pygame.image.load("spaceship.png")

playerX = 300
playerY = 400
playerSpeed = 0.4
playerX_left = False
playerX_right = False
playerX_lastInput = -1
LAST_INPUT_LEFT = 0
LAST_INPUT_RIGHT = 1
playerX_change = 0
playerY_change = 0

#Enemy
enemyImg = pygame.image.load("aircraft.png")

enemyX = random.randint(0,744)
enemyY = random.randint(50,150)
enemySpeed = 0.4
enemyX_left = False
enemyX_right = False
enemyX_lastInput = -1
#LAST_INPUT_LEFT = -1
#LAST_INPUT_RIGHT = 1
enemyX_change = 0
enemyY_change = 0 
enemySpeed = 0.4


# lazers

lazzerImg = pygame.image.load('bulets.png')
lazzerX = 0
lazzerY = 480
lazzerX_change = 0
lazzerY_change = 1
lazer_state = "ready"
def fire_lazzer(x,y):
    global lazzer_state
    lazzer_state = "fire"
    screen.blit(lazzerImg, (x+15 , y +11))

def player(x,y):
    """blit means draw takes 3 values the img and then x,y"""
    screen.blit(playerImg, (x, y))
def enemy(x,y):
    """blit means draw takes 3 values the img and then x,y"""
    screen.blit(enemyImg, (x, y))




"""make it so that the two can fight!"""






"""this is the game loop """
running = True

while running:
    
      #RGB - Red, Greeen, Blue
    screen.fill([255,255,255]) 
    # if you want background put it after this
    #
    
    """this closes when quit"""
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
#"""moving player around""" 
    #if a keystroke is pressed check wether right or left or up down.
        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT:
                print("left")
                playerX_left = True
                playerX_lastInput = LAST_INPUT_LEFT
                
            if event.key == pygame.K_RIGHT:
                print("right")
                playerX_right = True
                playerX_lastInput = LAST_INPUT_RIGHT

            if event.key == pygame.K_UP:
                print("up")
                playerY_change = -0.4

            if event.key == pygame.K_DOWN:
                print("down")
                playerY_change = 0.4
                
            #"""moving enemy around"""
            if event.key == pygame.K_w:
                print("w")
                enemyY_change = -0.4
            if event.key == pygame.K_a:
                print("a")
                enemyX_left = True
                enemyX_lastInput = LAST_INPUT_RIGHT
            if event.key == pygame.K_s:
                print("s")
                enemyY_change = 0.4
            if event.key == pygame.K_d:
                print("d")
                enemyX_right = True
                enemyX_lastInput = LAST_INPUT_RIGHT
            if event.key == pygame.K_SPACE:
                fire_lazzer(playerX, lazzerY)
            
                
                
        if event.type == pygame.KEYUP:
           #make each one seperate so that they can move.
            if event.key == pygame.K_LEFT:
                playerX_left = False
                print("left button Relessed")
            if event.key == pygame.K_UP:
                
                playerY_change = 0
                print("up button releassed")
                
            if event.key == pygame.K_DOWN:
                playerY_change = 0
                print("down button releassed")
            if event.key == pygame.K_RIGHT:
                playerX_right = False
                print("right button releassed")
            if event.key == pygame.K_s:
                print("s button releassed")
                enemyY_change = 0
            if event.key == pygame.K_a:
                enemyX_left = False
            if event.key == pygame.K_d:
                enemyX_right = False
            if event.key == pygame.K_w:
                enemyY_change = 0
           


      
      
      

          
        """Player changes can't get to big or small numbers for x"""  
    #creat player speed make sure last input will contiue      
    if playerX_left and playerX_right:
        if playerX_lastInput == LAST_INPUT_RIGHT:
            playerX_change = playerSpeed
        else:
            playerX_change = -playerSpeed
    elif playerX_left:
        playerX_change = -playerSpeed
    elif playerX_right:
        playerX_change = playerSpeed
    else:
        playerX_change = 0
        
    playerX += playerX_change
    if playerX <=0:
        playerX = 0
    elif playerX >= 744:
        playerX = 744
        
        
    playerY += playerY_change
    
    if playerY >= 744:
        playerY = 744
    elif playerY <= 0:
        playerY = 0
        
    player(playerX,playerY)
    """  end playeer changes """
    
    
    
    
    
    
    """enemy changes can't get to big or small"""
         
    if enemyX_left and enemyX_right:
        if enemyX_lastInput == LAST_INPUT_RIGHT:
            enemyX_change = playerSpeed
        else:
            enemyX_change = -playerSpeed
    elif enemyX_left:
        enemyX_change = -playerSpeed
    elif enemyX_right:
        enemyX_change = playerSpeed
    else:
        enemyX_change = 0
    
    
    enemyX += enemyX_change
    if enemyX <=0:
        enemyX = 0
    elif enemyX >= 744:
        enemyX = 744
        
    enemyY += enemyY_change
    if enemyY >= 744:
        enemyY = 744
    elif enemyY <= 0:
        enemyY <= 0
    enemy(enemyX,enemyY)
    
    # lazzer
    
#    if lazzer_state == "fire":
#        fire_lazzer(playerX,lazzerY)
#        lazzerY -= lazzerY_change
#        
    
  #  """end enemy changes""""

#    if playerX == enemyX and playerY == enemyY:
#        playerX = random.randint(0,744)
#        playerY = random.randint(550,700)
#        enemyX = random.randint(0,744)
#        enemyY = random.randint(50,150)
#    enemy(enemyX,enemyY)
#    player(playerX,playerY)
    pygame.display.update()     



"""this helped me quit the game """
pygame.quit ()